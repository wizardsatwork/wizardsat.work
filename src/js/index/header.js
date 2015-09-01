const header = document.querySelector('header.main');
const body = document.body;
const scrolledClass = 'scrolled';

function hasClass(node, className) {
  return node.className.indexOf(className) > -1;
}

window.addEventListener('scroll', resizeHeader);
resizeHeader();

function resizeHeader() {

  if (header && header.offsetTop) {
    const {offsetTop, clientHeight} = header;
    const topOffset = offsetTop + clientHeight;
    const scrollDiff = scrollY - topOffset;

    if (scrollDiff >= 0) {
      if (!hasClass(body, scrolledClass)) {
        body.classList.add(scrolledClass);
      }
    } else {
      if (hasClass(body, scrolledClass)) {
        body.classList.remove(scrolledClass);
      }
    }
  }
}