# wizardsat.work dockerfile
# VERSION 0.0.1

FROM wiznwit:magic

MAINTAINER Wizards & Witches <dev@wiznwit.com>
ENV REFRESHED_AT 2016-28-03

WORKDIR /srv

COPY package.json ./

ARG NODE_ENV

ENV NODE_ENV=production

RUN npm install --verbose --production

COPY src ./src/
COPY .babelrc ./

COPY ./bin/cli.sh .

RUN ./cli.sh build-src

CMD ["node", "dist/index.js"]
