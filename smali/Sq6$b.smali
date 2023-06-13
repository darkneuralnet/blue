.class public LSq6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSq6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LSq6;


# direct methods
.method public constructor <init>(LSq6;)V
    .locals 0

    iput-object p1, p0, LSq6$b;->b:LSq6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LSq6$b;->b:LSq6;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LSq6;->L(I)V

    return-void
.end method
