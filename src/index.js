import { Magic, conjure } from 'magic-root';

const app = conjure();

app.set('cwd', __dirname);

app.set('babelifyFiles', ['index']);

app.set('port', app.get('env') === 'development' ? 1337 : 80);

Magic(app);
