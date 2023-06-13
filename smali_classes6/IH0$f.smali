.class public final LIH0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC21$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:LIH0$c;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LIH0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIH0$f;->a:LIH0$c;

    return-void
.end method

.method public synthetic constructor <init>(LIH0$c;LIH0$a;)V
    .locals 0

    invoke-direct {p0, p1}, LIH0$f;-><init>(LIH0$c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;)LC21$a;
    .locals 0

    invoke-virtual {p0, p1}, LIH0$f;->b(Ljava/lang/String;)LIH0$f;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;)LIH0$f;
    .locals 0

    invoke-static {p1}, LyZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, LIH0$f;->b:Ljava/lang/String;

    return-object p0
.end method

.method public build()LC21;
    .locals 4

    iget-object v0, p0, LIH0$f;->b:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, LyZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LIH0$g;

    iget-object v1, p0, LIH0$f;->a:LIH0$c;

    iget-object v2, p0, LIH0$f;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LIH0$g;-><init>(LIH0$c;Ljava/lang/String;LIH0$a;)V

    return-object v0
.end method
