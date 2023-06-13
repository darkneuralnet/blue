.class public interface abstract LWx2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWx2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final a:LWx2$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LWx2$b$a;

    invoke-direct {v0}, LWx2$b$a;-><init>()V

    sput-object v0, LWx2$b;->a:LWx2$b;

    return-void
.end method


# virtual methods
.method public abstract log(Ljava/lang/String;)V
.end method
