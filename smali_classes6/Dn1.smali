.class public final LDn1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LSm1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LAn1;


# direct methods
.method public constructor <init>(LAn1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDn1;->a:LAn1;

    return-void
.end method

.method public static a(LAn1;)LDn1;
    .locals 1

    new-instance v0, LDn1;

    invoke-direct {v0, p0}, LDn1;-><init>(LAn1;)V

    return-object v0
.end method

.method public static c(LAn1;)LSm1;
    .locals 1

    invoke-virtual {p0}, LAn1;->c()LSm1;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, LxZ3;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LSm1;

    return-object p0
.end method


# virtual methods
.method public b()LSm1;
    .locals 1

    iget-object v0, p0, LDn1;->a:LAn1;

    invoke-static {v0}, LDn1;->c(LAn1;)LSm1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDn1;->b()LSm1;

    move-result-object v0

    return-object v0
.end method
