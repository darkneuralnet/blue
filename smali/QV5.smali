.class public final synthetic LQV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LSV5;


# direct methods
.method public synthetic constructor <init>(LSV5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQV5;->a:LSV5;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQV5;->a:LSV5;

    invoke-static {v0, p1}, LSV5;->d(LSV5;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
