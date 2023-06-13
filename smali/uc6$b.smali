.class public Luc6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc6$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luc6;->f(LDw1$c;I)LDw1$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Luc6$c<",
        "LDw1$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Luc6;


# direct methods
.method public constructor <init>(Luc6;)V
    .locals 0

    iput-object p1, p0, Luc6$b;->a:Luc6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LDw1$d;

    invoke-virtual {p0, p1}, Luc6$b;->c(LDw1$d;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LDw1$d;

    invoke-virtual {p0, p1}, Luc6$b;->d(LDw1$d;)Z

    move-result p1

    return p1
.end method

.method public c(LDw1$d;)I
    .locals 0

    invoke-virtual {p1}, LDw1$d;->e()I

    move-result p1

    return p1
.end method

.method public d(LDw1$d;)Z
    .locals 0

    invoke-virtual {p1}, LDw1$d;->f()Z

    move-result p1

    return p1
.end method
