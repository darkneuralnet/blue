.class public final Lcd3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LAa3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lbd3;


# direct methods
.method public constructor <init>(Lbd3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd3;->a:Lbd3;

    return-void
.end method

.method public static a(Lbd3;)Lcd3;
    .locals 1

    new-instance v0, Lcd3;

    invoke-direct {v0, p0}, Lcd3;-><init>(Lbd3;)V

    return-object v0
.end method

.method public static b(Lbd3;)LAa3;
    .locals 0

    invoke-virtual {p0}, Lbd3;->a()LAa3;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LAa3;

    return-object p0
.end method


# virtual methods
.method public c()LAa3;
    .locals 1

    iget-object v0, p0, Lcd3;->a:Lbd3;

    invoke-static {v0}, Lcd3;->b(Lbd3;)LAa3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcd3;->c()LAa3;

    move-result-object v0

    return-object v0
.end method
