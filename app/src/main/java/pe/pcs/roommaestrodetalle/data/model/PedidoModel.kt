package pe.pcs.roommaestrodetalle.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pedido")
data class PedidoModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id: Int = 0,
    @ColumnInfo(name = "fecha") var fecha: String = "",
    @ColumnInfo(name = "total") var total: Double = 0.0
    //@ColumnInfo(name = "serie") var serie: String = "",
    //@ColumnInfo(name = "correlativo") var correlativo: Int = 0
)