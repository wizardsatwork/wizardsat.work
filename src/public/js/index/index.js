const d = document;
const ANIMATED = 'animated';
const HERO = 'hero';
const HAT = 'hat';

const getById =
  id =>
    d.getElementById(id);

const onClick =
  evt => {
    getById(HERO).classList.add(ANIMATED);

    setTimeout(animate, 700);
  };

const animate =
  () => {
    const hero = getById(HERO);
    hero.classList.remove(ANIMATED);
    hero.innerHTML = hero.innerHTML;

    getById(HAT).addEventListener('click', onClick);
  };

getById(HAT).addEventListener('click', onClick);
