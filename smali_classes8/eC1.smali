.class public LeC1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String; = "ng"

.field public static b:Z = false

.field public static c:Z = false


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "jts.overlay"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LeC1;->b(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LWB1;LWB1;I)LWB1;
    .locals 1

    sget-boolean v0, LeC1;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, LuA3;->b(LWB1;LWB1;I)LWB1;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, LjM5;->b(LWB1;LWB1;I)LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    sget-boolean v0, LeC1;->b:Z

    sput-boolean v0, LeC1;->c:Z

    sget-object v0, LeC1;->a:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    sput-boolean p0, LeC1;->c:Z

    :cond_1
    return-void
.end method

.method public static c(LWB1;LWB1;)LWB1;
    .locals 2

    invoke-virtual {p0}, LWB1;->r0()Z

    move-result v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    invoke-virtual {p0}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object v0

    invoke-static {v1, p0, p1, v0}, LwA3;->h(ILWB1;LWB1;LbC1;)LWB1;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LWB1;->m()LWB1;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LWB1;->m()LWB1;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p0}, LWB1;->g(LWB1;)V

    invoke-static {p1}, LWB1;->g(LWB1;)V

    invoke-static {p0, p1, v1}, LeC1;->a(LWB1;LWB1;I)LWB1;

    move-result-object p0

    return-object p0
.end method
