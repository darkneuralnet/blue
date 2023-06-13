.class public final synthetic Lm36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:LO80$a;


# direct methods
.method public synthetic constructor <init>(LO80$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm36;->a:LO80$a;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lm36;->a:LO80$a;

    check-cast p1, Landroidx/camera/core/o$g;

    invoke-virtual {v0, p1}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method
