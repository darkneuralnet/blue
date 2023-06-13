.class public LPM2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liy5$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPM2;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:F

.field public final synthetic b:LPM2;


# direct methods
.method public constructor <init>(LPM2;F)V
    .locals 0

    iput-object p1, p0, LPM2$b;->b:LPM2;

    iput p2, p0, LPM2$b;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LNC0;)LNC0;
    .locals 2

    instance-of v0, p1, LYt4;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lk8;

    iget v1, p0, LPM2$b;->a:F

    invoke-direct {v0, v1, p1}, Lk8;-><init>(FLNC0;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
