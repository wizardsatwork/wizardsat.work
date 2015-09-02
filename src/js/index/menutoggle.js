import {hasClass, isFunction} from 'utils';

const toggler = document.querySelector('nav.main .toggle');
const toggleClassName = 'menu-toggled';

console.log({toggler});

toggler.addEventListener('click', () => {
  document.body.classList.toggle(toggleClassName);
});

const menuLinks = document.querySelectorAll('nav.main ul li a');

Object.keys(menuLinks).forEach(key => {
  const link = menuLinks[key];
  console.log('link', link);
  if (isFunction(link, 'addEventListener')) {
    console.log('adding EventListener', link);
    link.addEventListener('click', () => {
      console.log('click');
      if (hasClass(document.body, toggleClassName)) {
        document.body.classList.remove(toggleClassName);
      }
    });
  }
});
