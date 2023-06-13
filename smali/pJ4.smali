.class public final synthetic LpJ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LqJ4;


# direct methods
.method public synthetic constructor <init>(LqJ4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpJ4;->a:LqJ4;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LpJ4;->a:LqJ4;

    invoke-static {v0, p1}, LqJ4;->g(LqJ4;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
