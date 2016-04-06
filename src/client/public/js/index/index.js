const d = document;
const ANIMATED = 'animated';
const HERO = 'hero';
const HAT = 'hat';
const animDuration = 700;

const hasClass =
  (ele, cl) =>
    ele.className.indexOf(cl) > -1;

const getById =
  id =>
    d.getElementById(id);

const onClick =
  evt => {
    const hero = getById(HERO);
    if (hasClass(hero, ANIMATED)) {
      return;
    }

    hero.classList.add(ANIMATED);

    setTimeout(animate, animDuration);
  };

const resetAnimation =
  () =>
    getById(HERO).classList.remove(ANIMATED);

const animate =
  () => {
    const hero = getById(HERO);
    hero.innerHTML = hero.innerHTML;

    getById(HAT).addEventListener('click', onClick);

    setTimeout(resetAnimation, animDuration * 2)
  };

setTimeout(getById(HAT).addEventListener('click', onClick), animDuration);
