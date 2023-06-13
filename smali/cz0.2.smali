.class public final synthetic Lcz0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ldz0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ldz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz0;->b:Ljava/util/List;

    iput-object p2, p0, Lcz0;->c:Ldz0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcz0;->b:Ljava/util/List;

    iget-object v1, p0, Lcz0;->c:Ldz0;

    invoke-static {v0, v1}, Ldz0;->a(Ljava/util/List;Ldz0;)V

    return-void
.end method
