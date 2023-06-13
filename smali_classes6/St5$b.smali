.class public LSt5$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSt5;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LSt5;


# direct methods
.method public constructor <init>(LSt5;)V
    .locals 0

    iput-object p1, p0, LSt5$b;->b:LSt5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LSt5$b;->b:LSt5;

    const/4 v1, 0x1

    iput-boolean v1, v0, LSt5;->f:Z

    return-void
.end method
