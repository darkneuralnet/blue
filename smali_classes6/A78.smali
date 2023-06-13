.class public final synthetic LA78;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ78;


# static fields
.field public static final synthetic a:LA78;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LA78;

    invoke-direct {v0}, LA78;-><init>()V

    sput-object v0, LA78;->a:LA78;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    sget-object v0, La98;->a:Ljava/util/List;

    invoke-static {}, LYa9;->H()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
