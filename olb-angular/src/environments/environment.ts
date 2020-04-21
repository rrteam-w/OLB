// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `angular-cli.json`.

export const environment = {
  production: false,
  api: {
    'accounts':'https://raw.githubusercontent.com/rrteam-w/OLB/dev/JSON/account.json.txt',
    'appointments': 'https://raw.githubusercontent.com/rrteam-w/OLB/dev/JSON/appointment.json.txt',
    'customer': 'https://raw.githubusercontent.com/rrteam-w/OLB/dev/JSON/customer.json.txt',
    'transactions': 'https://raw.githubusercontent.com/rrteam-w/OLB/dev/JSON/transaction.json.txt',
    'recepient': 'https://raw.githubusercontent.com/rrteam-w/OLB/dev/JSON/recepient.json.txt'
  }
};
