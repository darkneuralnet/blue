.class public final synthetic LOD2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRD2$b;


# instance fields
.field public final synthetic a:LRD2;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(LRD2;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOD2;->a:LRD2;

    iput-object p2, p0, LOD2;->b:Ljava/lang/String;

    iput-object p3, p0, LOD2;->c:Ljava/lang/String;

    iput-boolean p4, p0, LOD2;->d:Z

    return-void
.end method


# virtual methods
.method public final a(LrD2;)V
    .locals 4

    iget-object v0, p0, LOD2;->a:LRD2;

    iget-object v1, p0, LOD2;->b:Ljava/lang/String;

    iget-object v2, p0, LOD2;->c:Ljava/lang/String;

    iget-boolean v3, p0, LOD2;->d:Z

    invoke-static {v0, v1, v2, v3, p1}, LRD2;->i(LRD2;Ljava/lang/String;Ljava/lang/String;ZLrD2;)V

    return-void
.end method
