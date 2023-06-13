.class public final synthetic LID2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRD2$b;


# instance fields
.field public final synthetic a:LRD2;

.field public final synthetic b:F

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(LRD2;FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LID2;->a:LRD2;

    iput p2, p0, LID2;->b:F

    iput p3, p0, LID2;->c:F

    return-void
.end method


# virtual methods
.method public final a(LrD2;)V
    .locals 3

    iget-object v0, p0, LID2;->a:LRD2;

    iget v1, p0, LID2;->b:F

    iget v2, p0, LID2;->c:F

    invoke-static {v0, v1, v2, p1}, LRD2;->g(LRD2;FFLrD2;)V

    return-void
.end method
