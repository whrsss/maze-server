package com.ck567.mazeserver.message

import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@Serializable
data class LoginRequestMessage(
    @ProtoNumber(1)
    val groupId: String,
    @ProtoNumber(2)
    val userId: String
)
