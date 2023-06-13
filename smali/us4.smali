.class public final synthetic Lus4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:LHs4;


# direct methods
.method public synthetic constructor <init>(LHs4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lus4;->a:LHs4;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lus4;->a:LHs4;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, LHs4;->l(LHs4;Landroid/net/Uri;)V

    return-void
.end method
