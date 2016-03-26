const hat = document.getElementById('hat');

hat.addEventListener('click', evt => {
  hat.classList.add('animated');

  setTimeout(() => hat.classList.remove('animated'), 500);
});