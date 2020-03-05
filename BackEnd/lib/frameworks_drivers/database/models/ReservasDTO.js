"use strict";
module.exports = (sequelize, DataTypes) => {
    var reservas = sequelize.define(
        "reservas", {
            horaInicio: DataTypes.STRING,
            horaSalida: DataTypes.STRING
        }, {
            timestamps: false
        }
    );

    reservas.associate = function(models) {
        models.reservas.belongsTo(models.espacios, {
            onDelete: "CASCADE",
            foreignKey: {
                allowNull: false
            },
            as: "espacio"
        });
        models.reservas.belongsTo(models.tarjetas, {
            onDelete: "CASCADE",
            foreignKey: {
                allowNull: false
            },
            as: "tarjeta"
        });
    };

    return reservas;
};