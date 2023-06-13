.class public final LjJ0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LjJ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:LAn1;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LjJ0$a;)V
    .locals 0

    invoke-direct {p0}, LjJ0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lyn1;
    .locals 3

    iget-object v0, p0, LjJ0$b;->a:LAn1;

    const-class v1, LAn1;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LjJ0;

    iget-object v1, p0, LjJ0$b;->a:LAn1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LjJ0;-><init>(LAn1;LjJ0$a;)V

    return-object v0
.end method

.method public b(LAn1;)LjJ0$b;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAn1;

    iput-object p1, p0, LjJ0$b;->a:LAn1;

    return-object p0
.end method
