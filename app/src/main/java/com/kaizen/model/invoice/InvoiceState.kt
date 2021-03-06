package com.kaizen.model.invoice

import com.google.gson.annotations.SerializedName
import java.io.Serializable

enum class InvoiceState : Serializable {
    @SerializedName("0")
    Generated {
        override fun toString(): String {
            return "Generada"
        }
    },

    @SerializedName("1")
    Regenerated {
        override fun toString(): String {
            return "ReGenerada"
        }
    },

    @SerializedName("2")
    Paid {
        override fun toString(): String {
            return "Pagada"
        }
    },

    @SerializedName("3")
    Expired {
        override fun toString(): String {
            return "Expirada"
        }
    }
}
