module.exports = {
    /*
    development: {
        dialect: "mysql",
        username: 'root',
        password: '',
        // port: '8889',
        database: 'parqueaderos',
        host: '127.0.0.1',
    },*/
    development: {
        dialect: "mysql",
        username: 'u4tivldchl3loxuv',
        password: '6gM7dxJ8A6y4UXBeYiEn',
        // port: '8889',
        database: 'bc7gqelmsaqi09pjpxat',
        host: 'bc7gqelmsaqi09pjpxat-mysql.services.clever-cloud.com',
    },
    test: {
        dialect: "mysql",
        username: 'root',
        password: '',
        // port: '8889',
        database: 'parqueaderos',
        host: '127.0.0.1',
    },
    production: {
        username: 'root',
        password: '',
        database: 'parqueaderos',
        host: '127.0.0.1',
        port: '8889',
        dialect: 'mysql',
        use_env_variable: 'DATABASE_URL'
    }
};