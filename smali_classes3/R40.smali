.class public final synthetic LR40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LS40;


# direct methods
.method public synthetic constructor <init>(LS40;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR40;->b:LS40;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LR40;->b:LS40;

    invoke-static {v0}, LS40;->m(LS40;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
