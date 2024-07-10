/*
* This module contains one package:
* com.entertainment.client
*
* As the client module, it doesn't export anything, but it DOES
* Requires the other module, com.entertainment
*/

module com.entertainment.client {
//     What other modules does this module depend on (use)?
    requires com.entertainment;
}