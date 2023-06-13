.class public final synthetic Lev6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lfv6;


# direct methods
.method public synthetic constructor <init>(Lfv6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev6;->b:Lfv6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lev6;->b:Lfv6;

    invoke-static {v0}, Lfv6;->o(Lfv6;)V

    return-void
.end method
