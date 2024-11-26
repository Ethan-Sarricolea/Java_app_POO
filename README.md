# Java_app_POO
Actividad de programación orientada a objetos, una aplicación desarrolada en Java con el paradigma de programación orientado a objetos.

Autor: @Ethan-Sarricolea

# Indice
- [Instrucciones](#instrucciones)
- [Entrega](#entrega)
- [Descripción](#descripción)
  - [Entidades](#entidades)
    - [Hospital](#hospital)
    - [Area de atencion](#area-de-atención)
    - [Persona (Abstracta)](#person)
    - [Doctor](#doctor)
    - [Appointment (cita)](#cita)
    - [Patient (Paciente)](#paciente)
    - [Medical record (expediente medico)](#expediente-medico)
  - [Relaciones](#relaciones)
  - [Sistema](#sistema)
- [Diagrama UML](#diagrama-uml)
- [Programa](#programa)
  - [Instalación](#instalación)
  - [Ejecución](#ejecución)

# Instrucciones

Diseñar una aplicación aplicando la POO con Java de uno de los temas que se mencionan a continuación:

1. Sistema de reserva de aerolíneas/autobuses/trenes
2. Sistema de gestión de bibliotecas
3. Sistema de atención médica
4. Sistema de seguimiento de vehículos
5. Sistema de banca electrónica
6. Sistema de nómina
7. Otra (solicitar autorización del profesor)


# Entrega

- Describe la aplicación a desarrollar, incluir menú por consola. (PDF)
- Desarrollar el diagrama UML (paquetes, herencia, otras relaciones (mismo PDF anterior)
- Construye la aplicación en lenguaje de programación Java (código fuente .zip)
- Utiliza control de versiones, sube la aplicación en GitHub (enlace Github))

# Descripción

Enunciado: Se quiere realizar un sistema de atención medica, donde se gestionan los hospitales, sus areas, medicos, pacientes, citas y expedientes.

## Entidades

### Hospital
El hospital es la institución donde se realizaran las atenciones medicas, del hospital es necesario saber cuantos hospitales hay, su nombre, su identificador y si nivel. De acorde al nivel del hospital tendrán diversas areas y serán las atenciones que podrá dar.

Nivel uno:
- Consulta general
- Medicina Preventiva
- Vacunación
- Enfermeria

Nivel dos:
- Cirugía general
- Especialidad (pediatría, ginecología, medicina interna).
- Laboratorio
- Hospitalización

Nivel tres:
- Terapia intensiva
- Especialidad avanzada
- Laboratorios avanzados
- Investigación

Enlace a PDF:

### Area de atención
Las areas de atención de un hospital dependen del nivel, Los hospitales de nivel uno cuentan con el area de ATención primaria, los de nivel dos con el area de Atencion Secundaria y los de nivel tres con el area de Atención Terciaria, un area contiene 4 tipos de atención.

### Person
Esta clase persona, será una clase abstracta acerca de las personas.

### Doctor

Los medicos atienden en diversas areas de los hospitales, y se identifican por su nombre, fecha de nacimiento, seño y especialidad.

### Cita

Los medicos atendrán a los pacientes en las citas, cada cita se registra en el sistema y contiene un identificador unico, la fecha de agenda, el hospital, el area, el nombre del paciente y un expediente del paciente.

### Paciente
De los pacientes se registra el nombre, sexo, fecha de nacimiento y en caso de tener se agrega su expediente medico.

### Expediente medico
Un expediente medico contiene una lista de padecimientos y notas sobre el paciente.

## Relaciones
- Un hospital tiene un area de atencion
- Un area de atención tiene una lista de medicos de esas especialidades
- Un medico atiende una cita
- Una cita es agendada por un paciente
- Un paciente tiene un expediente

## Sistema

El sistema permite ver la información del hospital, el listado de empleados y el listado de clientes.
Se puede ver la informacion del medico y de los pacientes.
Se pueden ver los expedientes medicos de un paciente y el listado de citas de un hospital.

# Diagrama UML


# Programa

## Instalación

`git clone https://github.com/Ethan-Sarricolea/Java_app_POO.git`

## Ejecución

`javac ruta/src/app.java`

## Estructura de carpetas

El espacio de trabajo contiene dos carpetas de forma predeterminada, donde:

- `src`: la carpeta para mantener las fuentes
- `lib`: la carpeta para mantener las dependencias

Mientras tanto, los archivos de salida compilados se generarán en la carpeta `bin` de forma predeterminada.

> Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.

## Administración de dependencias

La vista `PROYECTOS JAVA` le permite administrar sus dependencias. Puede encontrar más detalles [aquí](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).