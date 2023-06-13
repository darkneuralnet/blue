.class public final synthetic Lp72;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lq72;


# direct methods
.method public synthetic constructor <init>(Lq72;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp72;->b:Lq72;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lp72;->b:Lq72;

    invoke-static {v0}, Lq72;->a(Lq72;)V

    return-void
.end method
