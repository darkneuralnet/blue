.class public interface abstract Lu00;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu00$c;,
        Lu00$d;,
        Lu00$a;,
        Lu00$b;
    }
.end annotation


# static fields
.field public static final a:Lu00;

.field public static final b:Lu00;

.field public static final c:Lu00;

.field public static final d:Lu00;

.field public static final e:Lu00;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu00$b;

    invoke-direct {v0}, Lu00$b;-><init>()V

    sput-object v0, Lu00;->a:Lu00;

    new-instance v1, Lu00$a;

    invoke-direct {v1}, Lu00$a;-><init>()V

    sput-object v1, Lu00;->b:Lu00;

    new-instance v1, Lu00$d;

    invoke-direct {v1}, Lu00$d;-><init>()V

    sput-object v1, Lu00;->c:Lu00;

    new-instance v1, Lu00$c;

    invoke-direct {v1}, Lu00$c;-><init>()V

    sput-object v1, Lu00;->d:Lu00;

    sput-object v0, Lu00;->e:Lu00;

    return-void
.end method


# virtual methods
.method public abstract a(I)Z
.end method
