.class public final LDw1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDw1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDw1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:[LDw1$d;


# direct methods
.method public constructor <init>([LDw1$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDw1$c;->a:[LDw1$d;

    return-void
.end method


# virtual methods
.method public a()[LDw1$d;
    .locals 1

    iget-object v0, p0, LDw1$c;->a:[LDw1$d;

    return-object v0
.end method
