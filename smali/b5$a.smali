.class public Lb5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb5;->i(Landroid/app/Activity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lb5$d;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb5$d;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lb5$a;->b:Lb5$d;

    iput-object p2, p0, Lb5$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lb5$a;->b:Lb5$d;

    iget-object v1, p0, Lb5$a;->c:Ljava/lang/Object;

    iput-object v1, v0, Lb5$d;->b:Ljava/lang/Object;

    return-void
.end method
