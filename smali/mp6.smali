.class public final synthetic Lmp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lrp6;


# direct methods
.method public synthetic constructor <init>(Lrp6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp6;->b:Lrp6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lmp6;->b:Lrp6;

    invoke-static {v0}, Lrp6;->f(Lrp6;)V

    return-void
.end method
