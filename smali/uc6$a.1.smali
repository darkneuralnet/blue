.class public Luc6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc6$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luc6;->i([LLw1$b;I)LLw1$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Luc6$c<",
        "LLw1$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Luc6;


# direct methods
.method public constructor <init>(Luc6;)V
    .locals 0

    iput-object p1, p0, Luc6$a;->a:Luc6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LLw1$b;

    invoke-virtual {p0, p1}, Luc6$a;->c(LLw1$b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LLw1$b;

    invoke-virtual {p0, p1}, Luc6$a;->d(LLw1$b;)Z

    move-result p1

    return p1
.end method

.method public c(LLw1$b;)I
    .locals 0

    invoke-virtual {p1}, LLw1$b;->e()I

    move-result p1

    return p1
.end method

.method public d(LLw1$b;)Z
    .locals 0

    invoke-virtual {p1}, LLw1$b;->f()Z

    move-result p1

    return p1
.end method
