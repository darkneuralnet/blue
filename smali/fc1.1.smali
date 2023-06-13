.class public final synthetic Lfc1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lsb1;


# direct methods
.method public synthetic constructor <init>(Lsb1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc1;->b:Lsb1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lfc1;->b:Lsb1;

    invoke-interface {v0}, Lsb1;->e()V

    return-void
.end method
