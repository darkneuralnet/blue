.class public final synthetic LPr8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lbs8;


# direct methods
.method public synthetic constructor <init>(Lbs8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPr8;->b:Lbs8;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LPr8;->b:Lbs8;

    invoke-virtual {v0}, Lbs8;->a()Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
