/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfacturacion;

/**
 *
 * @author Joaquin
 */
public class Ubicacion {
    private int provincia; 
    private int canton;
    private int distrito;
    private String detalle;

    public Ubicacion(int provincia, int canton, int distrito, String detalle) {
        switch(provincia){
            case 1: { //SJ
                switch(canton){
                    case 1: { // SJ Central
                        switch(distrito){
                            case 1: { //Carmen
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 1;
                            }                           
                            case 2: { //Merced
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 2;
                            }
                            case 3:{ //Hospital
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 3;
                            }
                            case 4:{ //Catedral
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 4;
                            }                                
                            case 5:{ //Zapote
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 5;
                            }
                            case 6:{ //San Francisto
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 6;
                            }
                            case 7:{ //Uruca
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 7;
                            }
                            case 8:{ //Mata Redonda
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 8;
                            }
                            case 9:{ //Pavas
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 9;
                            }
                            case 10:{ //Hatillo
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 10;
                            }
                            case 11:{ //San Sebastian
                                this.provincia = 1;
                                this.canton = 1;
                                this.distrito = 11;
                            }                        
                        }
                    }
                    case 2:{ //Escazu
                        switch(distrito){
                            case 1: { //Escazu Central
                                this.provincia = 1;
                                this.canton = 2;
                                this.distrito = 1;
                            }
                            case 2:{ //San Antonio
                                this.provincia = 1;
                                this.canton = 2;
                                this.distrito = 2;
                            }
                            case 3:{ //San Rafael
                                this.provincia = 1;
                                this.canton = 2;
                                this.distrito = 3;
                            }                   
                       }                    
                    }
                    case 3:{ //Desamparados
                        switch(distrito){
                            case 1:{ //Desamparados Central
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 1;
                            }         
                            case 2:{ //San Miguel
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 2;
                            }
                            case 3:{ //San Juan de Dios
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 3;
                            }
                            case 4:{ //San Rafael Arriba
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 4;
                            }
                            case 5:{ //San Antonio
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 5;
                            }
                            case 6:{ //Frailes
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 6;
                            }
                            case 7:{ //Patarra
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 7;
                            }
                            case 8:{ //San Cristobal
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 8;
                            }
                            case 9:{ //Rosario
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 9;
                            }
                            case 10:{ //Damas
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 10;
                            }
                            case 11:{ //San Rafael Abajo
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 11;
                            }
                            case 12:{ //Gravilias
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 12;
                            }
                            case 13:{ //Los Guido
                                this.provincia = 1;
                                this.canton = 3;
                                this.distrito = 13;
                            }                                   
                        }
                    }                        
                    case 4:{//Puriscal
                        switch(distrito){
                            case 1:{ //Santiago
                                this.provincia = 1;
                                this.canton = 4;
                                this.distrito = 1;
                            }
                            case 2:{ //Mercedes Sur
                                this.provincia = 1;
                                this.canton = 4;
                                this.distrito = 2;
                            }
                            case 3:{ //Barbacoas
                                this.provincia = 1;
                                this.canton = 4;
                                this.distrito = 3;
                            }
                            case 4:{ //Grifo Alto
                                this.provincia = 1;
                                this.canton = 4;
                                this.distrito = 4;
                            }
                            case 5:{ //San Rafael
                                this.provincia = 1;
                                this.canton = 4;
                                this.distrito = 5;
                            }
                            case 6:{ //Candelaria
                                this.provincia = 1;
                                this.canton = 4;
                                this.distrito = 6;
                            }
                            case 7:{ //Desamparados
                                this.provincia = 1;
                                this.canton = 4;
                                this.distrito = 7;
                            }
                            case 8:{ //San Antonio
                                this.provincia = 1;
                                this.canton = 4;
                                this.distrito = 8;
                            }
                            case 9:{ //Chires
                                this.provincia = 1;
                                this.canton = 4;
                                this.distrito = 9;
                            }
                        }                    
                    }
                    case 5:{ // Tarrazu
                        switch(distrito){
                            case 1:{ //San Marcos
                                this.provincia = 1;
                                this.canton = 5;
                                this.distrito = 1;
                            }
                            case 2:{ //San Lorenzo
                                this.provincia = 1;
                                this.canton = 5;
                                this.distrito = 2;
                            }
                            case 3:{ //San Carlos
                                this.provincia = 1;
                                this.canton = 5;
                                this.distrito = 3;
                            }
                        }                    
                    }
                    case 6:{ //Aserri
                        switch(distrito){                        
                            case 1: { //Aserri Central
                                this.provincia = 1;
                                this.canton = 6;
                                this.distrito = 1;
                            }
                            case 2:{ //Tarbaca
                                this.provincia = 1;
                                this.canton = 6;
                                this.distrito = 2;
                            }
                            case 3:{ //Vuelta de Jorco
                                this.provincia = 1;
                                this.canton = 6;
                                this.distrito = 3;
                            }
                            case 4:{ //San Gabriel
                                this.provincia = 1;
                                this.canton = 6;
                                this.distrito = 4;
                            }
                            case 5:{ //Legua
                                this.provincia = 1;
                                this.canton = 6;
                                this.distrito = 5;
                            }
                            case 6:{ //Monterrey
                                this.provincia = 1;
                                this.canton = 6;
                                this.distrito = 6;
                            }
                            case 7:{ //Salitrillos
                                this.provincia = 1;
                                this.canton = 6;
                                this.distrito = 7;
                            }
                        }
                    }
                    case 7:{ // Mora
                        switch(distrito){
                            case 1:{ //Colon
                                this.provincia = 1;
                                this.canton = 7;
                                this.distrito = 1;
                            }
                            case 2:{ //Guayabo
                                this.provincia = 1;
                                this.canton = 7;
                                this.distrito = 2;
                            }
                            case 3:{ //Tabarcia
                                this.provincia = 1;
                                this.canton = 7;
                                this.distrito = 3;
                            }
                            case 4:{ //Piedras Negras
                                this.provincia = 1;
                                this.canton = 7;
                                this.distrito = 4;
                            }
                            case 5:{ //Picagres
                                this.provincia = 1;
                                this.canton = 7;
                                this.distrito = 5;
                            }
                            case 6:{ //Jaris
                                this.provincia = 1;
                                this.canton = 7;
                                this.distrito = 6;
                            }
                            case 7:{ //Quitirrisi
                                this.provincia = 1;
                                this.canton = 7;
                                this.distrito = 7;
                            }
                        }                    
                    }
                    case 8:{ //Goicoechea
                        switch(distrito){
                            case 1:{ //Guadalupe
                                this.provincia = 1;
                                this.canton = 8;
                                this.distrito = 1;
                            }
                            case 2:{ //San Francisco
                                this.provincia = 1;
                                this.canton = 8;
                                this.distrito = 2;
                            }
                            case 3:{ //Calle Blancos
                                this.provincia = 1;
                                this.canton = 8;
                                this.distrito = 3;
                            }
                            case 4:{ //Mata de Platano
                                this.provincia = 1;
                                this.canton = 8;
                                this.distrito = 4;
                            }
                            case 5:{ //Ipis
                                this.provincia = 1;
                                this.canton = 8;
                                this.distrito = 5;
                            }
                            case 6:{ //Rancho Redondo
                                this.provincia = 1;
                                this.canton = 8;
                                this.distrito = 6;
                            }
                            case 7:{ //Purral
                                this.provincia = 1;
                                this.canton = 8;
                                this.distrito = 7;
                            }                        
                        }                    
                    }
                    case 9:{// Santa Ana
                        switch(distrito){
                            case 1:{ //Santa Ana
                                this.provincia = 1;
                                this.canton = 9;
                                this.distrito = 1;
                            }
                            case 2:{ //Salitral
                                this.provincia = 1;
                                this.canton = 9;
                                this.distrito = 2;
                            }
                            case 3:{ //Pozos
                                this.provincia = 1;
                                this.canton = 9;
                                this.distrito = 3;
                            }
                            case 4:{ //Uruca
                                this.provincia = 1;
                                this.canton = 9;
                                this.distrito = 4;
                            }
                            case 5:{ //Piedades
                                this.provincia = 1;
                                this.canton = 9;
                                this.distrito = 5;
                            }
                            case 6:{ //Brasil
                                this.provincia = 1;
                                this.canton = 9;
                                this.distrito = 6;
                            }                            
                        }                    
                    }
                    case 10:{//Alajuelita
                        switch(distrito){
                            case 1:{//Alajuelita Central
                                this.provincia = 1;
                                this.canton = 10;
                                this.distrito = 1;                           
                            }
                            case 2:{//San Josecito
                                this.provincia = 1;
                                this.canton = 10;
                                this.distrito = 2;                           
                            }
                            case 3:{//San Antonio
                                this.provincia = 1;
                                this.canton = 10;
                                this.distrito = 3;                           
                            }
                            case 4:{//Concepcion
                                this.provincia = 1;
                                this.canton = 10;
                                this.distrito = 4;                           
                            }
                            case 5:{//San Felipe
                                this.provincia = 1;
                                this.canton = 10;
                                this.distrito = 5;                           
                            }
                        }                    
                    }
                    case 11:{//Coronado
                        switch(distrito){
                            case 1:{//San Isidro
                                this.provincia = 1;
                                this.canton = 11;
                                this.distrito = 1;
                            } 
                            case 2:{//San Rafael
                                this.provincia = 1;
                                this.canton = 11;
                                this.distrito = 2;
                            } 
                            case 3:{//Dulce Nombre
                                this.provincia = 1;
                                this.canton = 11;
                                this.distrito = 3;
                            } 
                            case 4:{//Patalillo
                                this.provincia = 1;
                                this.canton = 11;
                                this.distrito = 4;
                            } 
                            case 5:{//Cascajal
                                this.provincia = 1;
                                this.canton = 11;
                                this.distrito = 5;
                            }                                 
                        }                   
                    }
                    case 12:{//Acosta
                        switch(distrito){
                            case 1:{//San Ignacio
                                this.provincia = 1;
                                this.canton = 12;
                                this.distrito = 1;
                            } 
                            case 2:{//Guaitil
                                this.provincia = 1;
                                this.canton = 12;
                                this.distrito = 2;
                            } 
                            case 3:{//Palmichal
                                this.provincia = 1;
                                this.canton = 12;
                                this.distrito = 3;
                            } 
                            case 4:{//Cangrejal
                                this.provincia = 1;
                                this.canton = 12;
                                this.distrito = 4;
                            } 
                            case 5:{//Sabanillas
                                this.provincia = 1;
                                this.canton = 12;
                                this.distrito = 5;
                            }                                 
                        }
                    }
                    case 13:{//Tibas
                        switch(distrito){
                            case 1:{//San Juan
                                this.provincia = 1;
                                this.canton = 13;
                                this.distrito = 1;
                            } 
                            case 2:{//Cinco Esquinas
                                this.provincia = 1;
                                this.canton = 13;
                                this.distrito = 2;
                            } 
                            case 3:{//Llorente
                                this.provincia = 1;
                                this.canton = 13;
                                this.distrito = 3;
                            } 
                            case 4:{//Leon XIII
                                this.provincia = 1;
                                this.canton = 13;
                                this.distrito = 4;
                            } 
                            case 5:{//Colima
                                this.provincia = 1;
                                this.canton = 13;
                                this.distrito = 5;
                            }                                 
                        }                    
                    }
                    case 14:{//Moravia
                        switch(distrito){
                            case 1:{//San Vicente
                                this.provincia = 1;
                                this.canton = 14;
                                this.distrito = 1;
                            }
                            case 2:{//San Jeronimo
                                this.provincia = 1;
                                this.canton = 14;
                                this.distrito = 2;
                            }
                            case 3:{//San Vicente
                                this.provincia = 1;
                                this.canton = 14;
                                this.distrito = 3;
                            }
                        }
                    }
                    case 15:{//Montes de Oca
                        switch(distrito){
                            case 1:{//San Pedro
                                this.provincia = 1;
                                this.canton = 15;
                                this.distrito = 1;
                            }
                            case 2:{//Sabanilla
                                this.provincia = 1;
                                this.canton = 15;
                                this.distrito = 2;
                            }
                            case 3:{//Mercedes
                                this.provincia = 1;
                                this.canton = 15;
                                this.distrito = 3;
                            }
                            case 4:{//San Rafael
                                this.provincia = 1;
                                this.canton = 15;
                                this.distrito = 4;
                            }
                        }
                    }
                    case 16:{//Turrubares
                        switch(distrito){
                            case 1:{//San Pablo
                                this.provincia = 1;
                                this.canton = 16;
                                this.distrito = 1;
                            }
                            case 2:{//San Pedro
                                this.provincia = 1;
                                this.canton = 16;
                                this.distrito = 2;
                            }
                            case 3:{//San Juan
                                this.provincia = 1;
                                this.canton = 16;
                                this.distrito = 3;
                            }
                            case 4:{//San Luis
                                this.provincia = 1;
                                this.canton = 16;
                                this.distrito = 4;
                            }
                            case 5:{//San Luis
                                this.provincia = 1;
                                this.canton = 16;
                                this.distrito = 5;
                            }
                        }
                    }
                    case 17:{//Dota
                        switch(distrito){
                            case 1:{//Santa Maria
                                this.provincia = 1;
                                this.canton = 17;
                                this.distrito = 1;
                            }
                            case 2:{//Jardin
                                this.provincia = 1;
                                this.canton = 17;
                                this.distrito = 2;
                            }
                            case 3:{//Copey
                                this.provincia = 1;
                                this.canton = 17;
                                this.distrito = 3;
                            }
                        }
                    }
                    case 18:{//Curridabat
                        switch(distrito){
                            case 1:{//Curridabat Central
                               this.provincia = 1;
                                this.canton = 18;
                                this.distrito = 1; 
                            }
                            case 2:{//Granadilla
                               this.provincia = 1;
                                this.canton = 18;
                                this.distrito = 2; 
                            }  
                            case 3:{//Sanchez
                               this.provincia = 1;
                                this.canton = 18;
                                this.distrito = 3; 
                            }
                            case 4:{//Tirrases
                               this.provincia = 1;
                                this.canton = 18;
                                this.distrito = 4; 
                            }
                        }
                    }
                    case 19:{//Perez Zeledon
                        switch(distrito){
                            case 1:{//San Isidro
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 1; 
                            }
                            case 2:{//El General
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 2; 
                            }
                            case 3:{//Daniel Flores
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 3; 
                            }
                            case 4:{//Rivas
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 4; 
                            }
                            case 5:{//San Pedro
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 5; 
                            }
                            case 6:{//Platanares
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 6; 
                            }
                            case 7:{//Pejibaye
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 7; 
                            }
                            case 8:{//Cajon
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 8; 
                            }
                            case 9:{//Baru
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 9; 
                            }
                            case 10:{//Rio Nuevo
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 10; 
                            }
                            case 11:{//Paramo
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 11; 
                            }
                            case 12:{//La Amistad
                               this.provincia = 1;
                                this.canton = 19;
                                this.distrito = 12; 
                            }                                
                        }                    
                    }
                    case 20:{//Leon Cortes
                        switch(distrito){
                            case 1:{//San Pablo
                               this.provincia = 1;
                                this.canton = 20;
                                this.distrito = 1; 
                            }   
                            case 2:{//San Andres
                               this.provincia = 1;
                                this.canton = 20;
                                this.distrito = 2; 
                            }
                            case 3:{//Llano Bonito
                               this.provincia = 1;
                                this.canton = 20;
                                this.distrito = 3; 
                            }
                            case 4:{//San Isidro
                               this.provincia = 1;
                                this.canton = 20;
                                this.distrito = 4; 
                            } 
                            case 5:{//Santa Cruz
                               this.provincia = 1;
                                this.canton = 20;
                                this.distrito = 5; 
                            }
                            case 6:{//San Antonio
                               this.provincia = 1;
                                this.canton = 20;
                                this.distrito = 6; 
                            }
                        }
                    } 
                }            
            }
                
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:      
        }
        this.canton = canton;  
        this.distrito = distrito;
        this.detalle = detalle;
    }
    
    
    
} 
