.class public final synthetic Lpj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc80;


# instance fields
.field public final synthetic a:Lqj0$a;


# direct methods
.method public synthetic constructor <init>(Lqj0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj0;->a:Lqj0$a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lpj0;->a:Lqj0$a;

    invoke-static {v0}, Lqj0;->b(Lqj0$a;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
