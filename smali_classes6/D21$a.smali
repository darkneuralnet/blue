.class public LD21$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF21$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD21;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LC21;)LF21;
    .locals 1

    new-instance v0, LF21;

    invoke-direct {v0, p1}, LF21;-><init>(LC21;)V

    return-object v0
.end method
