.class public final synthetic Ljf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:Llf0;


# direct methods
.method public synthetic constructor <init>(Llf0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljf0;->a:Llf0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ljf0;->a:Llf0;

    check-cast p1, Lf74;

    invoke-virtual {v0, p1}, Llf0;->f(Lf74;)V

    return-void
.end method
