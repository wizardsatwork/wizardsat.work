import {hasClass, isFunction} from 'utils';

const toggler = document.querySelector('nav.main .toggle');
const toggleClassName = 'menu-toggled';

if (isFunction(toggler, 'addEventListener')) {
  toggler.addEventListener('click', () => {
    document.body.classList.toggle(toggleClassName);
  });
}

const menuLinks = document.querySelectorAll('nav.main ul li a');

Object.keys(menuLinks).forEach(key => {
  const link = menuLinks[key];
  if (isFunction(link, 'addEventListener')) {
    link.addEventListener('click', () => {
      if (hasClass(document.body, toggleClassName)) {
        document.body.classList.remove(toggleClassName);
      }
    });
  }
});
