.class public final synthetic Ljl7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxq7;


# instance fields
.field public final a:Lsj7;


# direct methods
.method public constructor <init>(Lsj7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljl7;->a:Lsj7;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljl7;->a:Lsj7;

    invoke-virtual {v0}, Lsj7;->q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
