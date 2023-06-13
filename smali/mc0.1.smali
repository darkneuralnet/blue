.class public final synthetic Lmc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lnc0$b;


# direct methods
.method public synthetic constructor <init>(Lnc0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc0;->b:Lnc0$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lmc0;->b:Lnc0$b;

    invoke-interface {v0}, Lnc0$b;->a()V

    return-void
.end method
