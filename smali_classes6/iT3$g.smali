.class public interface abstract LiT3$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LiT3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "g"
.end annotation


# static fields
.field public static final a:LiT3$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LiT3$g$a;

    invoke-direct {v0}, LiT3$g$a;-><init>()V

    sput-object v0, LiT3$g;->a:LiT3$g;

    return-void
.end method


# virtual methods
.method public abstract a(LqI4;)LqI4;
.end method
