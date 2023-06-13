.class public final synthetic LPs2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LUs2;


# direct methods
.method public synthetic constructor <init>(LUs2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPs2;->a:LUs2;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LPs2;->a:LUs2;

    invoke-static {v0, p1}, LUs2;->g(LUs2;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
