.class public final synthetic LA90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LF90;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LF90;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA90;->b:LF90;

    iput-object p2, p0, LA90;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LA90;->b:LF90;

    iget-object v1, p0, LA90;->c:Ljava/util/List;

    invoke-static {v0, v1}, LF90;->z(LF90;Ljava/util/List;)V

    return-void
.end method
