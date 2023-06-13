.class public final LWU8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J


# direct methods
.method public synthetic constructor <init>(LhV8;LLU8;)V
    .locals 0

    invoke-virtual {p1}, LhV8;->h0()LOW8;

    move-result-object p2

    invoke-virtual {p2}, LOW8;->n()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LWU8;-><init>(LhV8;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(LhV8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LWU8;->a:Ljava/lang/String;

    invoke-virtual {p1}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, LWU8;->b:J

    return-void
.end method

.method public synthetic constructor <init>(LhV8;Ljava/lang/String;LLU8;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LWU8;-><init>(LhV8;Ljava/lang/String;)V

    return-void
.end method
