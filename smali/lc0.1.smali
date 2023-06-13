.class public final synthetic Llc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lnc0$c;


# direct methods
.method public synthetic constructor <init>(Lnc0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llc0;->b:Lnc0$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Llc0;->b:Lnc0$c;

    invoke-interface {v0}, Lnc0$c;->a()V

    return-void
.end method
