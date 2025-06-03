# README del Progetto Android

## Introduzione

Questo progetto Android è costituito da due **Activity** principali: una per la **pagina di login** e una per il **Menu principale** dell'app. All'interno del menu, c'è un pulsante che apre una **WebView** per caricare il sito di Netflix. L'app è progettata per essere semplice da usare e navigare, con una serie di interazioni di base per gli utenti. Di seguito, troverai una descrizione generale delle principali funzionalità e attività implementate in questo progetto.

## Attività Principali

### 1. **MainActivity (Login)**
L'utente inizia l'esperienza con la **MainActivity**, che è la schermata di login. Quando l'utente apre l'app, vedrà due campi di input: uno per il nome utente e uno per la password.

- **Funzionamento:**
  - Se l'utente inserisce un nome utente e una password corretti (nome utente: "Riccardo" e password: "newPass2025"), verrà automaticamente indirizzato alla schermata del **Menu principale**.
  - Se le credenziali non sono corrette o se i campi non sono riempiti correttamente, l'app mostrerà un messaggio di errore.
  - La password viene **criptata** (utilizzando un algoritmo di hash MD5) per maggiore sicurezza, anche se in un'applicazione di produzione sarebbe necessario un metodo più sicuro per la gestione delle credenziali.

- **Scopo:** La schermata di login ha lo scopo di autenticare l'utente e di permettergli di accedere al contenuto successivo dell'app.

### 2. **MenuActivity (Menu Principale)**
Dopo il login, l'utente viene portato alla **MenuActivity**, che funge da schermata principale dell'app. Questa attività contiene tre pulsanti che portano l'utente a diverse funzionalità:

- **Pulsante "Search"**: Quando cliccato, questo pulsante mostra un messaggio "Search" e poi porta l'utente alla schermata di ricerca (che potrebbe essere una schermata di ricerca di contenuti, anche se non è ancora implementata in questa versione dell'app).
  
- **Pulsante "WebView"**: Questo pulsante apre una **WebView**, che carica il sito di **Netflix** all'interno dell'app. La WebView permette all'utente di navigare su un sito web direttamente senza lasciare l'app, simulando una vera e propria navigazione dentro l'app stessa.

- **Pulsante "Rest"**: Anche questo pulsante mostra un messaggio "Rest" quando cliccato e potrebbe essere destinato a un'altra funzionalità, come una schermata di ristorazione o un menu di servizi. Al momento non è completamente definito, ma è un segnaposto per una futura funzionalità.

### 3. **WebViewActivity (WebView)**
La **WebViewActivity** è una schermata che si apre quando l'utente clicca sul pulsante **"WebView"** nel menu. In questa schermata, l'utente può visualizzare il sito di Netflix direttamente all'interno dell'app. La WebView permette di caricare il sito web e interagire con esso senza uscire dall'app.

- **Funzionamento:**
  - Quando l'utente apre questa schermata, il sito di **Netflix** viene caricato automaticamente.
  - La navigazione all'interno della WebView è gestita in modo che se l'utente cerca di cliccare su un link, venga aperto sempre all'interno della stessa WebView, invece che nel browser esterno.
  - Se l'utente cerca di tornare indietro durante la navigazione, l'app lo porta indietro nella cronologia della WebView, invece di chiudere l'intera schermata.

### Come Funziona l'App?

1. **Login:**
   - L'utente apre l'app e inserisce un nome utente e una password. Se le credenziali sono corrette, l'utente viene indirizzato al menu principale.
   - Se le credenziali sono errate o mancanti, l'app mostrerà un errore.

2. **Menu Principale:**
   - Una volta autenticato, l'utente può scegliere tra tre opzioni nel menu:
     - Cercare contenuti (anche se questa funzionalità non è ancora implementata).
     - Vedere il sito web di Netflix direttamente nell'app.
     - Accedere a una sezione ancora non definita chiamata "Rest".

3. **WebView:**
   - Se l'utente seleziona l'opzione di vedere il sito web di Netflix, l'app caricherà il sito all'interno della WebView. Potrà navigare su Netflix senza mai lasciare l'app.

