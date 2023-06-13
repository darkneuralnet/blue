.class public Lca$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lba$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca;->c(Ljava/lang/String;Lba$b;)Lba$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lca;


# direct methods
.method public constructor <init>(Lca;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lca$a;->b:Lca;

    iput-object p2, p0, Lca$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
